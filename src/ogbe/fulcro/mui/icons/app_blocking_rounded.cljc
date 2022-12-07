(ns ogbe.fulcro.mui.icons.app-blocking-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AppBlockingRounded" :default AppBlockingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-blocking-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppBlockingRounded)))