(ns ogbe.fulcro.mui.icons.memory-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MemoryOutlined" :default MemoryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-memory-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MemoryOutlined)))