(ns ogbe.fulcro.mui.icons.minimize-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MinimizeOutlined" :default MinimizeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-minimize-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MinimizeOutlined)))