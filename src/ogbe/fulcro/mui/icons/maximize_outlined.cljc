(ns ogbe.fulcro.mui.icons.maximize-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MaximizeOutlined" :default MaximizeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-maximize-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MaximizeOutlined)))