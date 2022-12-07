(ns ogbe.fulcro.mui.icons.bento-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BentoOutlined" :default BentoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bento-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BentoOutlined)))