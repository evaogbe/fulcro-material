(ns ogbe.fulcro.mui.icons.no-crash-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NoCrashSharp" :default NoCrashSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-crash-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCrashSharp)))