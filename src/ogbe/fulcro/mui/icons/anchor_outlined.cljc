(ns ogbe.fulcro.mui.icons.anchor-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AnchorOutlined" :default AnchorOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-anchor-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnchorOutlined)))