(ns ogbe.fulcro.mui.icons.circle-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CircleOutlined" :default CircleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-circle-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CircleOutlined)))