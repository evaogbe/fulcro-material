(ns ogbe.fulcro.mui.icons.casino
  #?(:cljs (:require
            ["@mui/icons-material/Casino" :default Casino]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-casino
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Casino)))