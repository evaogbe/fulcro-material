(ns ogbe.fulcro.mui.icons.opacity-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OpacitySharp" :default OpacitySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-opacity-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpacitySharp)))