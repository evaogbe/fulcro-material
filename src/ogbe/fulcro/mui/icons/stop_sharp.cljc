(ns ogbe.fulcro.mui.icons.stop-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StopSharp" :default StopSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stop-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StopSharp)))