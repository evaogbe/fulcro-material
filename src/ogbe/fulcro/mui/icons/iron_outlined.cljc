(ns ogbe.fulcro.mui.icons.iron-outlined
  #?(:cljs (:require
            ["@mui/icons-material/IronOutlined" :default IronOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iron-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IronOutlined)))