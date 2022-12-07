(ns ogbe.fulcro.mui.icons.gavel-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GavelOutlined" :default GavelOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gavel-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GavelOutlined)))