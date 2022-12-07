(ns ogbe.fulcro.mui.icons.light-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LightOutlined" :default LightOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-light-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightOutlined)))