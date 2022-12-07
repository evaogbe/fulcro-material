(ns ogbe.fulcro.mui.icons.details-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DetailsOutlined" :default DetailsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-details-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DetailsOutlined)))