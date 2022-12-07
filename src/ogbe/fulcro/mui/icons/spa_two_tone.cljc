(ns ogbe.fulcro.mui.icons.spa-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SpaTwoTone" :default SpaTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spa-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaTwoTone)))