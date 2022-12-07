(ns ogbe.fulcro.mui.icons.gite-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GiteOutlined" :default GiteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gite-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GiteOutlined)))