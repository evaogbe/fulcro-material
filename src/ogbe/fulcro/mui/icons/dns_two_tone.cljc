(ns ogbe.fulcro.mui.icons.dns-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DnsTwoTone" :default DnsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dns-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DnsTwoTone)))