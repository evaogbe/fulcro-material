(ns ogbe.fulcro.mui.icons.grain-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GrainOutlined" :default GrainOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grain-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GrainOutlined)))