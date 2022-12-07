(ns ogbe.fulcro.mui.icons.soup-kitchen
  #?(:cljs (:require
            ["@mui/icons-material/SoupKitchen" :default SoupKitchen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-soup-kitchen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SoupKitchen)))