(ns ogbe.fulcro.mui.icons.developer-board
  #?(:cljs (:require
            ["@mui/icons-material/DeveloperBoard" :default DeveloperBoard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-developer-board
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeveloperBoard)))