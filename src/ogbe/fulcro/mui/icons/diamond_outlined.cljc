(ns ogbe.fulcro.mui.icons.diamond-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DiamondOutlined" :default DiamondOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-diamond-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiamondOutlined)))