(ns ogbe.fulcro.mui.icons.memory-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MemoryRounded" :default MemoryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-memory-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MemoryRounded)))