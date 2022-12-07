(ns ogbe.fulcro.mui.icons.place-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PlaceOutlined" :default PlaceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-place-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaceOutlined)))