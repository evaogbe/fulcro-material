(ns ogbe.fulcro.mui.icons.tungsten-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TungstenOutlined" :default TungstenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tungsten-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TungstenOutlined)))