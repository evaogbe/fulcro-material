(ns ogbe.fulcro.mui.icons.pin
  #?(:cljs (:require
            ["@mui/icons-material/Pin" :default Pin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pin)))