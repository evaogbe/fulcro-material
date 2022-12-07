(ns ogbe.fulcro.mui.icons.factory
  #?(:cljs (:require
            ["@mui/icons-material/Factory" :default Factory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-factory
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Factory)))