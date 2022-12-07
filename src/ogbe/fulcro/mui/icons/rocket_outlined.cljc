(ns ogbe.fulcro.mui.icons.rocket-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RocketOutlined" :default RocketOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rocket-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RocketOutlined)))