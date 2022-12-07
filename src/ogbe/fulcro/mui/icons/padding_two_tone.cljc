(ns ogbe.fulcro.mui.icons.padding-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PaddingTwoTone" :default PaddingTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-padding-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaddingTwoTone)))