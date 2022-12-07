(ns ogbe.fulcro.mui.icons.lightbulb-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LightbulbOutlined" :default LightbulbOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lightbulb-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightbulbOutlined)))