(ns ogbe.fulcro.mui.icons.try-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TrySharp" :default TrySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-try-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrySharp)))