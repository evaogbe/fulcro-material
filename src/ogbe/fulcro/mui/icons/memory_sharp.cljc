(ns ogbe.fulcro.mui.icons.memory-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MemorySharp" :default MemorySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-memory-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MemorySharp)))