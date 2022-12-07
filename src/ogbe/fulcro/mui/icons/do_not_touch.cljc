(ns ogbe.fulcro.mui.icons.do-not-touch
  #?(:cljs (:require
            ["@mui/icons-material/DoNotTouch" :default DoNotTouch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-do-not-touch
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoNotTouch)))