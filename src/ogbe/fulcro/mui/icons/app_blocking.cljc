(ns ogbe.fulcro.mui.icons.app-blocking
  #?(:cljs (:require
            ["@mui/icons-material/AppBlocking" :default AppBlocking]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-blocking
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppBlocking)))