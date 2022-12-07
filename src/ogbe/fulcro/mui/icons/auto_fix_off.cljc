(ns ogbe.fulcro.mui.icons.auto-fix-off
  #?(:cljs (:require
            ["@mui/icons-material/AutoFixOff" :default AutoFixOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-fix-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoFixOff)))