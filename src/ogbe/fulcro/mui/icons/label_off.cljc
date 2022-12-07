(ns ogbe.fulcro.mui.icons.label-off
  #?(:cljs (:require
            ["@mui/icons-material/LabelOff" :default LabelOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LabelOff)))