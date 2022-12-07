(ns ogbe.fulcro.mui.icons.touch-app-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TouchAppRounded" :default TouchAppRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-touch-app-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TouchAppRounded)))