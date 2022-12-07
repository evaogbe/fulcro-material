(ns ogbe.fulcro.mui.icons.home-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HomeOutlined" :default HomeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HomeOutlined)))