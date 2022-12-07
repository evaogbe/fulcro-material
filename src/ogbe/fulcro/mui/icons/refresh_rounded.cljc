(ns ogbe.fulcro.mui.icons.refresh-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RefreshRounded" :default RefreshRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-refresh-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RefreshRounded)))