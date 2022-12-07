(ns ogbe.fulcro.mui.icons.warning-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WarningSharp" :default WarningSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warning-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WarningSharp)))