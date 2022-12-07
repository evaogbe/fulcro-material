(ns ogbe.fulcro.mui.icons.label-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LabelTwoTone" :default LabelTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LabelTwoTone)))