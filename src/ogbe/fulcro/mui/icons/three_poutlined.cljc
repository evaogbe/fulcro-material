(ns ogbe.fulcro.mui.icons.three-poutlined
  #?(:cljs (:require
            ["@mui/icons-material/ThreePOutlined" :default ThreePOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-poutlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreePOutlined)))