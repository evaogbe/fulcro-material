(ns ogbe.fulcro.mui.icons.pinterest
  #?(:cljs (:require
            ["@mui/icons-material/Pinterest" :default Pinterest]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pinterest
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pinterest)))