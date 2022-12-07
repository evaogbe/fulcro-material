(ns ogbe.fulcro.mui.icons.euro-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EuroOutlined" :default EuroOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-euro-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EuroOutlined)))