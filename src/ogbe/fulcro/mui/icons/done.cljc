(ns ogbe.fulcro.mui.icons.done
  #?(:cljs (:require
            ["@mui/icons-material/Done" :default Done]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Done)))