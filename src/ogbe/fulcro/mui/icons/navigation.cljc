(ns ogbe.fulcro.mui.icons.navigation
  #?(:cljs (:require
            ["@mui/icons-material/Navigation" :default Navigation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-navigation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Navigation)))