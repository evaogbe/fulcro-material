(ns ogbe.fulcro.mui.icons.token-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TokenOutlined" :default TokenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-token-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TokenOutlined)))