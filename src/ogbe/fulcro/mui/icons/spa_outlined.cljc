(ns ogbe.fulcro.mui.icons.spa-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SpaOutlined" :default SpaOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spa-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaOutlined)))