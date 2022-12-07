(ns ogbe.fulcro.mui.icons.sledding
  #?(:cljs (:require
            ["@mui/icons-material/Sledding" :default Sledding]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sledding
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sledding)))