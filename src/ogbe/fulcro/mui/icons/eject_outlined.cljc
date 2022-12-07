(ns ogbe.fulcro.mui.icons.eject-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EjectOutlined" :default EjectOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-eject-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EjectOutlined)))