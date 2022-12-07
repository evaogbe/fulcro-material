(ns ogbe.fulcro.mui.icons.remember-me-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RememberMeRounded" :default RememberMeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remember-me-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RememberMeRounded)))