(ns ogbe.fulcro.mui.icons.local-taxi
  #?(:cljs (:require
            ["@mui/icons-material/LocalTaxi" :default LocalTaxi]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-taxi
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalTaxi)))