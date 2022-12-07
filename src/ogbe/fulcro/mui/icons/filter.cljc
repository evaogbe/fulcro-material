(ns ogbe.fulcro.mui.icons.filter
  #?(:cljs (:require
            ["@mui/icons-material/Filter" :default Filter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Filter)))