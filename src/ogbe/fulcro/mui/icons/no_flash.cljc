(ns ogbe.fulcro.mui.icons.no-flash
  #?(:cljs (:require
            ["@mui/icons-material/NoFlash" :default NoFlash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-flash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoFlash)))