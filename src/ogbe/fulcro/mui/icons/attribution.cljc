(ns ogbe.fulcro.mui.icons.attribution
  #?(:cljs (:require
            ["@mui/icons-material/Attribution" :default Attribution]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attribution
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Attribution)))